public class Practice_8_11_1_Perfect {
    //成员变量
    double height;//身高
    double weight;//体重

    //构造方法
    public Practice_8_11_1_Perfect(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    //成员方法:根据身高和体重，计算BMI指数，判断胖瘦
    public void bmi_calc() {
        double bmi;  // BMI指数
        bmi = this.weight / (this.height * this.height);
        if (bmi < 18.5) {
            System.out.println("太瘦啦");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("标准体重");
        } else if (bmi > 25 && bmi <= 28) {
            System.out.println("有点胖");
        } else if (bmi > 28 && bmi <= 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("严重肥胖");
        }
    }

    public static void main(String[] args) {
        Practice_8_11_1_Perfect xiaomu_BMI = new Practice_8_11_1_Perfect(1.75, 85);
        xiaomu_BMI.bmi_calc();
        Practice_8_11_1_Perfect damao_BMI = new Practice_8_11_1_Perfect(1.72, 55);
        damao_BMI.bmi_calc();
    }
}
