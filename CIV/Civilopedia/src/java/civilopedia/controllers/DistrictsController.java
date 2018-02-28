package civilopedia.controllers;

import java.util.List;
import civilopedia.dal.DistrictsDal;
import civilopedia.model.Districts;

/**
 *
 * @author Anna 
 */
public class DistrictsController {

    protected DistrictsDal districtsDal;

    public DistrictsController() {
        this.districtsDal = new DistrictsDal();
    }

    public List<Districts> getAllDistricts() {
        return districtsDal.selectAll();
    }

    public Districts getDistricts(int id) {
        return districtsDal.selectById(id);
    }

    public int insertDistricts(Districts districts) {
        return districtsDal.insert(districts);
    }

    public int updateDistricts(Districts districts) {
        return districtsDal.update(districts);
    }

    public int deleteDistricts(int id) {
        return districtsDal.deleteById(id);
    }

}
