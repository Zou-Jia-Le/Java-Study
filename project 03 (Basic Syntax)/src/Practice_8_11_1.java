public class Practice_8_11_1 {
    //成员变量
    public float height;
    public float weight;

    //构造方法
    public Practice_8_11_1 (float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    //成员方法:根据身高和体重，计算BMI指数，判断胖瘦
    public void bmiCalculate() {
        float bmi = this.weight / this.height * this.height;
        if (bmi < 18.5F) {
            System.out.println("偏瘦");
        }else if (bmi <= 25F) {
            System.out.println("正常体重");
        }else if (bmi <= 28F) {
            System.out.println("有点胖");
        }else if (bmi <= 32F) {
            System.out.println("肥胖");
        }else{
            System.out.println("严重肥胖");
        }
    }

    public static void main(String[] args) {
        Practice_8_11_1 xiaomu_bmi = new Practice_8_11_1(1.75F,85F);
        xiaomu_bmi.bmiCalculate();
        Practice_8_11_1 damao_bmi = new Practice_8_11_1(1.72F,55F);
        damao_bmi.bmiCalculate();
    }
}
