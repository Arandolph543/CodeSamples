/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cachesimulator;

/**
 * Class Cache.java: This is the object that simulates the actual cache blocks
 * that are used containing a valid bit, tag bit, index bit and block offset.
 * We are assumming a byte-addressable computer and the size of memory address
 * is 32-bits. The cache is initially empty.
 *
 */

public class Cache {

    int indexSize = 0;
    //valid bit is '1' if bad data, not valid
    int vbit = 0;
    
    String input = "";
    String writeback = null;
    String instr = null;
    String found = null;
    String[] block = null;
    String replacePolicy = "";
    int totalHitRate = 0;
    int MH = 0;

    //each cache has vaild bit blocks and set the assoc, the replacement policy, along with writeback policy
    public Cache(int szCache,int szBlock,int assoc, String replacePolicy, String writeback)
    {
        this.replacePolicy = replacePolicy;
        this.writeback = writeback;
        
        for(int i = 0;i<= szCache; i++)
        {
            Block block = new Block("", szBlock);
            //input = block.Block(address, i, i, assoc);
           if(input.startsWith("W"))
           {
                //If the address is a write the tag is checked, the index is used for offset, the address is written to either the cache and/or main memory.
                block.blkAddress = input.substring(1, input.length());
            
           }else if(input.startsWith("R"))
           {
                //If the address is a read then the tag and the address is searched for and counted as a hit or miss.
                block.blkAddress = input.substring(1, input.length());
           }

        }

        while(block != null)
        {
          //takes the associativity into account when checking the addresses in the cache.
          indexSize  = (int)(Math.log((szCache/(szBlock * assoc)))/Math.log(2));
        }
    }
    public int getHitRate()
    {
        int hitrate = 0;



        return hitrate;
    }
    public void mainMemory()
    {



    }
    class Block {

     String[] block = null;
     String data = "";
     String blkAddress = null;
     int blkTag = 0;
     int index = 0;
     int blkOffset = 0;
     Block info = null;
     boolean v = false;
     int szCache = 0;
     int szBlock = 0;
     int assoc = 0;
     
    private Block(String input, int blkSize)
    {
        //valid bit checked with a matching tag the index calculated and the offset if needed.

        this.szBlock = blkSize;
         //String tempinput = new String[];
        try{
          
            for(int j = 0;j<=blkSize;j++)
            {
                
            }

        }catch(UnsupportedOperationException e)
        {
            System.out.println(e);
        }

        //this.assoc = tempInput;
        System.out.print(blkAddress);
       
        

        info = getAddressBlock(blkTag, blkAddress);
        
       
    }
    
   public void addBlock(String blkAddress, int blkTag, int index, int blkOffset)
   {
        blkAddress = this.blkAddress;
        blkTag = this.blkTag;
        index = this.index;
        blkOffset = this.blkOffset;
   }
   public boolean setBlock()
   {
      boolean v = false;

      return v;
   }
   //This is a way to get the block address
    private Block getAddressBlock(int blkTag, String blkAddress)
    {
        //info = new Block(" ");
        info.blkAddress = this.blkAddress;
        info.blkTag = this.blkTag;

        return info;
    }
  }
}
