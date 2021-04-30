package bc;


import java.util.ArrayList;
import com.google.gson.GsonBuilder;
public class NoobBlock {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        Block genesisBlock = new Block("Hi im the first block","0");
        Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
        Block thirdBlock = new Block("Hee im the third block",secondBlock.hash);
        blockchain.add(genesisBlock);
        blockchain.add(secondBlock);
        blockchain.add(thirdBlock);
        System.out.println(genesisBlock);
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockchainJson);
    }
}