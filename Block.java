package cachesimulator;

/**
 *
 * @author April
 */
class Block {

     String replacePolicy = "";
     String[] block = null;
     String blkAddress = null;
     String writeback = null;
     String data = "";
     int blkTag = 0;
     int index = 0;
     int blkOffset = 0;
     Block info = null;
     boolean v = false;
     int szCache = 0;
     int szBlock = 0;
     int assoc = 0;

    private Block(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

   
    private String[] Block(String input)
    {
         //String tempinput = new String[];
        try{
                if(input.startsWith("W"))
           {
            //If the address is a write the tag is checked, the index is used for offset, the address is written to either the cache and/or main memory.
            blkAddress = input.substring(1, input.length());
           }else if(input.startsWith("R"))
           {
               //If the address is a read then the tag and the address is searched for and counted as a hit or miss.
                blkAddress = input.substring(1, input.length());
           }
        }catch(UnsupportedOperationException e)
        {
            System.out.println(e);
        }
        
        //this.assoc = tempInput;
        System.out.print(blkAddress);
        this.replacePolicy = replacePolicy;
        this.writeback = writeback;
  
        //valid bit checked with a matching tag the index calculated and the offset if needed.
        return block;  
    }

   public void addBlock(String blkAddress, int blkTag, int index, int blkOffset)
   {
        blkAddress = this.blkAddress;
        blkTag = this.blkTag;
        index = this.index;
        blkOffset = this.blkOffset;
   }
   //This is a way to get the block address
    public Block getAddressBlock()
    {
        info = new Block(" ");
        info.blkAddress = this.blkAddress;
        info.blkTag = this.blkTag;
        
        
        return info;
    }


}
