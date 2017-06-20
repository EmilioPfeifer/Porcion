/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;


import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author p.m.h
 */
public class TareaSemanalQuartz {

    public TareaSemanalQuartz() {
        crearProgramacionTarea();
    }



    private void crearProgramacionTarea() {
        try {

          JobDetail job1 = JobBuilder.newJob(VentanaInicio.class)
					.withIdentity("ventanaInicio", "group1").build();

			Trigger trigger1 = TriggerBuilder.newTrigger()
					.withIdentity("cronTrigger1", "group1")
                                      //.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
					.withSchedule(CronScheduleBuilder.cronSchedule(" 0 10,44 14 ? * WED"))
                               
					.build();
			
			Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
			scheduler1.start();
			scheduler1.scheduleJob(job1, trigger1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
