package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String name;

    private List<Station> itemList = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void addItemAtIndex(Integer index, Station station){
        this.itemList.add(index, station);
    }

    public void addItem(Station station){
        this.itemList.add(station);
    }

    public List<Station> getItemList() {
        return itemList;
    }
}
