package sample.interfaces;

import sample.models.Schedule;

import java.util.List;

public interface ISchedule {

    public List<Schedule> getAllSchedulesByUser(int userID);

}
