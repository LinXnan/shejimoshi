package builderpattern;

/**
 * describe:
 *
 * @author 林旭南
 * @date 2020-03-23 下午 06:37
 */
public class T420ComputerBuilder implements ComputerBuilder{
    private T420 computer = new T420();
    @Override
    public void buildCpu() {
        computer.setCpu("Core I7");
    }

    @Override
    public void buildRam() {
        computer.setRam("8G");
    }

    @Override
    public void buildGraphicCard() {
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
