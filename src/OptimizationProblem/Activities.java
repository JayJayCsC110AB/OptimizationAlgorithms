package OptimizationProblem;

import java.time.temporal.WeekFields;
import java.util.Iterator;

import positionallist.*;
public class Activities implements Iterable<WeekScheduler>{
    //List the amount of activities thats currently available
    //Adds amount of hours on to each activity
    private PositionalList<WeekScheduler> SchdlList;

    public Activities() {
        SchdlList = new LinkedPositionalList<>();
    }

    public PositionalList<WeekScheduler> getSchdlList() {
        return SchdlList;
    }

    public WeekScheduler addScheduler(String Activity, double hours) {
        WeekScheduler Scheduler = new WeekScheduler(Activity, hours);
        schdlList.addOrdered(Scheduler);
        return Scheduler;
    }

    public Interest findHours (double Hours) {
        for ( WeekScheduler Scheduler : SchdlList) {
            if (SchdlList.getHours() == Hours) {
                return Hours;
            }
        }
        return null;
    }

    public Interest findActivitiy(String Activity) {
        for (WeekScheduler Scheduler : SchdlList) {
            if (SchdlList.getActivity().equals(Activity)) {
                return Activity;
            }
        }
        return null;
    }

    public Iterator<Interest> iterator() {
        return intrList.iterator();
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Activity: " + Activity + ", Amount of Hours: " + hours + "\n");
        for (Interest interest : intrList) {
            result.append("  ").append(Scheduler.getActivity()).append(": ").append(Scheduler.getHours()).append("\n");
        }
        return result.toString();
    }

}

    
