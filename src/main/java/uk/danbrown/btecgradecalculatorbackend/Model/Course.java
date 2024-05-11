package uk.danbrown.btecgradecalculatorbackend.Model;

import java.util.List;

public record Course(String courseType, List<String> mandatoryUnits, List<String> optionalUnits, Integer optionalUnitCount) {
}
