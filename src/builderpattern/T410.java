package builderpattern;

/**
 * describe: T410 型号的计算机
 *
 * @author 林旭南
 * @date 2020-03-23 下午 06:28
 */
public class T410 extends Computer{
    private String graphicCard;// 显卡

    public T410 (){
        this.setType("型号T410");
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
}
