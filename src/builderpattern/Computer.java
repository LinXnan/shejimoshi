package builderpattern;

/**
 * describe: computer 抽象产品
 *
 * @author 林旭南
 * @date 2020-03-23 下午 06:25
 */
public abstract class Computer {
    private String type;//型号
    private String cpu;// cpu
    private String ram;// 内存

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
