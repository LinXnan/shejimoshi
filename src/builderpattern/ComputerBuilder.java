package builderpattern;

public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildGraphicCard();
    Computer getResult();
}
