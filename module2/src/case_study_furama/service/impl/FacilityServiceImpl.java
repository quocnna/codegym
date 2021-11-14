package case_study_furama.service.impl;

import case_study_furama.model.Facility;
import case_study_furama.model.House;
import case_study_furama.model.Room;
import case_study_furama.model.Villa;
import case_study_furama.service.FacilityService;
import case_study_furama.util.ConstantUtil;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilitys= new LinkedHashMap<>();

    static {
        House house= new House( "HOU01", "Sweet House", 5, 55555, 5,
                ConstantUtil.RentType.MONTH, ConstantUtil.RoomType.STANDARD, 3);
        house.setId(1);
        facilitys.put( house, 0);
    }

    @Override
    public Map<Facility, Integer> getFacilitys() {
        return facilitys;
    }

    @Override
    public Facility getById(int id) {
        return facilitys.keySet().stream().filter(e-> id== e.getId()).findFirst().get();
    }

    @Override
    public void addVilla(Villa villa) {
        villa.setId(facilitys.size()+ 1);
        facilitys.put(villa, 0);
    }

    @Override
    public void addHouse(House house) {
        house.setId(facilitys.size()+ 1);
        facilitys.put(house, 0);
    }

    @Override
    public void addRoom(Room room) {

    }
}
