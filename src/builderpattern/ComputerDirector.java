package builderpattern;

/**
 * describe:
 *
 * @author 林旭南
 * @date 2020-03-23 下午 06:41
 */
public class ComputerDirector {
    ComputerBuilder computerBuilder;

    public T410 constructT410(){
        computerBuilder = new T410ComputerBuilder();
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildGraphicCard();
        return (T410) computerBuilder.getResult();
    }

    public T420 constructT420(){
        computerBuilder = new T420ComputerBuilder();
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        return (T420) computerBuilder.getResult();
    }

    // 测试
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        T410 t410 = computerDirector.constructT410();
        T420 t420 =computerDirector.constructT420();
        System.out.println(t410.getType()+t410.getCpu());
        System.out.println("-------------------------");
        System.out.println(t420.getType()+t420.getCpu());
    }
}
