package week10;


public class Task1 {

    public static List<String> getAllFunctions(File path){
        List<String> list = null;
        try {
            list = new ArrayList<String>();
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if(line.contains("static") ==  true)
                    list.add(line);
                //System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static String findFunctionByName(String name){
        File file = new File("C:\\oop\\file4.txt");
        int dem = 0;
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine())!= null){
                line = line.trim();
                if(line.contains(name) ==  true){
                    dem++;
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(dem == 0) return null;
        else return name;
    }
    public static void main(String [] args) {
        List<String> ob = new ArrayList<String>();
        ob = Task1.getAllFunctions(new File("C:\\Users\\CCNE\\IdeaProjects\\oop2018\\src\\week9\\Utils.java"));
        for (String s : ob) {
            System.out.println(s);
        }
        String a = Task1.findFunctionByName("String readContentFromFile");
        if(a == null)
            System.out.println("\n\nnham "+ a + " khong ton tai trong file");
        else System.out.println("\n\nham " + a + " co ton tai trong file");
    }


}