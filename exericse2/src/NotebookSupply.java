public class NotebookSupply {
    private static final int NOTEBOOKS=35;
    private static final int NOTEBOOKS_PER_TEAM=6;
    public static void main(String[] args){
        int teams=4;
        int notebooksLeft=NOTEBOOKS-(teams*NOTEBOOKS_PER_TEAM);
        System.out.println("There are " + notebooksLeft + " remaining notebooks");
    }
}
