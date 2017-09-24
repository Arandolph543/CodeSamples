// Elevator.java

// By <Student Name>
//    Towson University
//    October, 1997


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

// An applet to simulate an Elevator
public class Elevator extends Applet
   implements Runnable, MouseListener {

   // scene will have up to 10 models
   Scene2D scene=new Scene2D(10);
   Matrix2D m1=new Matrix2D();
   Matrix2D m2=new Matrix2D();
   Matrix2D m3=new Matrix2D();
   Matrix2D m4=new Matrix2D();
   Matrix2D m5=new Matrix2D();
   Matrix2D m6=new Matrix2D();
   Matrix2D m7=new Matrix2D();
   Matrix2D m8=new Matrix2D();
   Matrix2D m9=new Matrix2D();

   // Simulation Constants
   // the step size for moving elevator, etc
   float delta=0.6f;
   float crankRadius=5.0f;

   // status of the simulation
   int sequenceMode=0;
   float elevation;
   float exitY;
   float doorX;
   float bugsX;
   float bugsY;
   
   String message = null;
   
   int fps=15;   // frames per second display rate

   Thread animatorThread;
   boolean frozen = false;


   Dimension offDimension;
   Image offImage;
   Graphics offGraphics;

   // Initialize the applet.
   //
   public void init() {
      String str;

      // How many milliseconds between frames?
      str = getParameter("fps");
      try {
         if (str != null) {
             fps = Integer.parseInt(str);
         }
      } catch (Exception e) {
      }

      setBackground(Color.white);
      setLayout(new BorderLayout());
      String mdname = getParameter("model");
      if (mdname == null) {
         mdname = "bugs.dat";
      }
      System.out.println("Elevator init started");

      try {
         Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
         scene.setModel(1,new Model2D(new URL(getDocumentBase(),"elevator.dat")));
         scene.setModel(2,new Model2D(new URL(getDocumentBase(),"circle.dat")));
         scene.setModel(3,new Model2D(new URL(getDocumentBase(),"spokes.dat")));
         scene.setModel(4,new Model2D(new URL(getDocumentBase(),"bugs.dat")));
         scene.setModel(5,new Model2D(new URL(getDocumentBase(),"door.dat")));
         scene.setModel(6,new Model2D(new URL(getDocumentBase(),"building.dat")));
         // model 7 is same as model 1
	 scene.setModel(7,scene.getModel(1));	 
         // model 8 is same as model 1
	 scene.setModel(8,scene.getModel(1));	 
         // model 9 is same as model 1
	 scene.setModel(9,scene.getModel(1));	 

         // the coordinate system of the scene
	 scene.setWindow(-20.0f,50.0f,-2.0f,47.0f);
         scene.setColor(1,Color.green);
         scene.setColor(2,Color.black);
         scene.setColor(3,Color.red);
         scene.setColor(4,Color.blue);
         scene.setColor(5,Color.magenta);
         scene.setColor(6,Color.black);
         scene.setColor(7,Color.black);
         scene.setColor(8,Color.black);
         scene.setColor(9,Color.black);
         scene.setMatrix(1,m1);
         scene.setMatrix(2,m2);
         scene.setMatrix(3,m3);
         scene.setMatrix(4,m4);
         scene.setMatrix(5,m5);
         scene.setMatrix(6,m6);
         scene.setMatrix(7,m7);
         scene.setMatrix(8,m8);
         scene.setMatrix(9,m9);
      } catch(Exception e) {
         message = e.toString();
         System.exit(1);
      }
      // do not allow size below 200 X 200
//      resize(size().width < 200 ? 200 : size().width,
//             size().height < 200 ? 200 : size().height);
     addMouseListener(this);
   }

   public void start() {
      if (frozen) {
         // Do nothing.  The user has requested that we
         //stop changing the image.
      } else {
         // Start animating!
         if (animatorThread == null) {
            animatorThread = new Thread(this);
         }
         animatorThread.start();
         System.out.println("Animator thread started");
      }
   }

   public void stop() {
      // Stop the animating thread.
      animatorThread = null;

      // Get rid of the objects necessary for double buffering.
      offGraphics = null;
      offImage = null;
   }
    
   private void drawMenu(Graphics g) {
      g.setColor(Color.black);
      g.drawString("Mode = "+Integer.toString(sequenceMode),5,25);
   }

   public void mousePressed(MouseEvent e) {
   }
   public void mouseReleased(MouseEvent e) {
   }
   public void mouseEntered(MouseEvent e) {
   }
   public void mouseExited(MouseEvent e) {
   }
   public void mouseClicked(MouseEvent e) {
      if (frozen) {
         frozen = false;
         start();
         System.out.println("Animator thread started");
      } else {
        frozen = true;
        // Instead of calling stop(), which destroys the
        // backbuffer, just stop the animating thread.
        animatorThread = null;
        System.out.println("Animator thread stopped");
      }
   }

   public void run() {
      // lower this thread's priority
      Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
 
      // Remember the starting time.
      long startTime = System.currentTimeMillis();

      //This is the animation loop.
      while (Thread.currentThread() == animatorThread) {
         // Display the animation
         repaint();

         // Delay depending on the frame rate
         int delay = (fps > 0) ? (1000 / fps) : 100;
         try {
            startTime += delay;
            Thread.sleep(Math.max(0, 
                       startTime-System.currentTimeMillis()));
         } catch (InterruptedException e) {
             break;
         }
      }
   }
    
   public void paint(Graphics g) {
      update(g);
   }

   public void update(Graphics g) {
      // This is the elevator simulation main loop

      if (sequenceMode==0) {
         // initialize elevator to first floor
	 elevation=(0)*10;
	 sequenceMode=1;
      } else if (sequenceMode==1) {
         // choose random entry and exit floor
	 // exit floor cannot be same as entry floor
	 sequenceMode=2;
      } else if (sequenceMode==2) {
         // entering floor from right to left
	 // if (bugs at elevator) {
	    // sequenceMode=3;
	 // }
      // } else if (sequenceMode==3) {
         //elevator moving to bugs
	 // if (elevation at bugs) {
	    // sequenceMode=4;
	 // }
      // } else if (sequenceMode==4) {
         // door opening
	 // if (door is open) {
	    // sequenceMode=5;
	 // }
      // } else if (sequenceMode==5) {
         // entering elevator
	 // if (bugs in elevator) {
	    // sequenceMode=6;
	 // }
      // } else if (sequenceMode==6) {
         // door closing
	 // if (door is closed) {
	    // sequenceMode=7;
	 // }
      // } else if (sequenceMode==7) {
         // elevator moving to destination
	 // if (elevation at destination) {
	    // sequenceMode=8;
	 // }
      // } else if (sequenceMode==8) {
         // door opening
	 // if (door is open) {
	    // sequenceMode=9;
	 // }
      // } else if (sequenceMode==9) {
         // exiting elevator 
	 // if (bugs out of elevator) {
	    // sequenceMode=10;
	 // }
      // } else if (sequenceMode==10) {
         // door closing as bugs exits
	 // if (door is closed) {
	    // sequenceMode=11;
	 // }
      // } else if (sequenceMode==11) {
         // exiting floor from left to right
	 // if (bugs on right) {
	    // sequenceMode=1;
	 // }
      }

      // after changing the scene parameters, recalculate the
      // model transforms
      // relate the change in elevation to the angle of the motor
      float crankTheta= (float)((elevation/crankRadius)*180.0/Math.PI);
      
      // model 1 elevator.dat
      m1.unit();
      m1.translate(1.0f,elevation+1.0f);

      // model 2 circle.dat
      m2.unit();
      m2.scale(crankRadius);
      m2.rotate(crankTheta);
      m2.translate(0.0f,40.0f);

      // model 3 spokes.dat
      m3.unit();
      m3.scale(crankRadius);
      m3.rotate(crankTheta);
      m3.translate(0.0f,40.0f);

      // model 4 bugs.dat
      m4.unit();
      m4.scale( (float) (8.0/320.0));
      m4.translate(1.0f,elevation+1.0f);

      // model 5 door.dat
      m5.unit();
      m5.translate(1.0f,elevation+1.0f);

      // model 6 building.dat
      m6.unit();

      // model 7 elevator.dat (counterweight)
      m7.unit();
      // half the size of the elevator = 4 x 4
      m7.scale(0.5f, 0.5f);
      m7.translate(-7.0f,40.0f-elevation-6.0f);

      // model 8 elevator.dat (counterweight cable)
      m8.unit();

      // model 9 elevator.dat (elevator cable)
      m9.unit();

      // now to actually refresh the scene
      Dimension d = getSize();
        
      // get ready for double buffering
      if ( (offGraphics == null)
          || (d.width != offDimension.width)
          || (d.height != offDimension.height) ) {
         offDimension = d;
         offImage = createImage(d.width, d.height);
         offGraphics = offImage.getGraphics();
      }

      // Erase the previous image.
      offGraphics.setColor(getBackground());
      offGraphics.fillRect(0, 0, d.width, d.height);
      offGraphics.setColor(Color.black);


      //Paint the image onto the screen.
      // obtain the display area size
      Rectangle r = getBounds();

      // refresh the scene -- draw the model
      scene.draw(offGraphics, r);

      // draw the menu
      drawMenu(offGraphics);
      g.drawImage(offImage, 0, 0, this);
   }
}
