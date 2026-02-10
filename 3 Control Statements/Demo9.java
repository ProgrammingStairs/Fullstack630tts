// example showing the concept of switch case
// duplicate case label
class Demo9{
    public static void main(String args[]){
        char ch='a';
        switch(ch){
            case 'a' : System.out.println("character"); 
                        break;
            case 97 : System.out.println("Ascii value"); 
                        break;
            default : System.out.println("Invalid selection"); 
                        break;
        }
    }
}