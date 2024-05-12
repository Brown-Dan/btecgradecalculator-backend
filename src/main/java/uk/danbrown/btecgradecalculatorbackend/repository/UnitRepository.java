package uk.danbrown.btecgradecalculatorbackend.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public class UnitRepository {

    public Integer getGuidedLearningHoursByUnitName(String unitName) {
        return Arrays.stream(UnitEntity.values())
                .filter(unit -> unit.getName().equals(unitName))
                .map(UnitEntity::getGuidedLearningHours)
                .findFirst().get();
    }
}
