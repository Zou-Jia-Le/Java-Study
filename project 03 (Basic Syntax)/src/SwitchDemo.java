public class SwitchDemo {
    //静态方法
    public static void travel() {
        switch ("云南"){
            case "黑龙江":
                System.out.println("看白山黑水，走林海雪原");
                break;
            case "海南":
                System.out.println("天涯海角，南国风情");
                break;
            case "云南":
                System.out.println("彩云之南，四季如春");
                break;
            case "陕西":
                System.out.println("人文陕西，多彩三奏");
                break;
            default :
                System.out.println("本地一日游");
        }
    }

    public static void main(String[] args) {
        travel();
    }
}
