import org.apache.commons.collections.Factory;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ChainedTransformer;
import org.apache.commons.collections.keyvalue.TiedMapEntry;
import org.apache.commons.collections.map.LazyMap;

import javax.management.BadAttributeValueExpException;
import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException, ClassNotFoundException {

//        BadAttributeValueExpException badattr = new BadAttributeValueExpException(null);
//
//        Class cls = badattr.getClass();
//
//        Map map = new HashMap();
//
////        ChainedTransformer a = new ChainedTransformer(Transformer);
//
//        Transformer a = new Transformer() {
//            @Override
//            public Object transform(Object o) {
//                return null;
//            }
//        };
//
//        LazyMap lazymap = (LazyMap) LazyMap.decorate(map, a);
//
//
//        TiedMapEntry tiedmap = new TiedMapEntry(map,"foo");
//
//
//        Field field = cls.getDeclaredField("val");
//        field.setAccessible(true);
//        field.set(badattr, tiedmap);
//
//        serialization(badattr);

        desiarization();

    }

    public static void serialization(Object obj) {
        try(FileOutputStream fos = new FileOutputStream("D:\\student2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(obj);
        }catch(IOException i) {
            i.printStackTrace();
        }
        System.out.println("Serialization success!!!");
    }


    public static void desiarization() throws FileNotFoundException, IOException, ClassNotFoundException {
        Object obj = null;
        try(FileInputStream fis = new FileInputStream("D:\\student2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            obj = (Object) ois.readObject();
        }catch (IOException i) {
            i.printStackTrace();
        }

        System.out.println("Deserialization success!!!");

    }
}
