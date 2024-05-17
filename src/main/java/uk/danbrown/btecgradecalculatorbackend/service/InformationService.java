package uk.danbrown.btecgradecalculatorbackend.service;

import org.springframework.stereotype.Service;
import uk.danbrown.btecgradecalculatorbackend.Model.Course;
import uk.danbrown.btecgradecalculatorbackend.repository.InformationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InformationService {

    private final InformationRepository informationRepository;

    public InformationService(InformationRepository informationRepository) {
        this.informationRepository = informationRepository;
    }

    public Optional<Course> findCourseBySubjectAndType(String subject, String courseType) {
        return informationRepository.findCourseBySubjectAndType(subject, courseType);
    }

    public Optional<List<Course>> getCoursesBySubject(String subject) {
        return informationRepository.getSubjectInformation(subject);
    }

    public List<String> getSupportedCourseTypes(String subject) {
        return informationRepository.getSupportedCourseTypes(subject);
    }
}
