package builderpattern;

/**
 * describe:
 *
 * @author 林旭南
 * @date 2020-03-23 下午 06:37
 */
public class T410ComputerBuilder implements ComputerBuilder{
    private T410 computer = new T410();
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
        computer.setGraphicCard("有显卡");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
