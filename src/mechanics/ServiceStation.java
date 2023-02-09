package mechanics;
import transport.Transport;

import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation (Queue<Transport> queue){
        this.queue = queue;
    }

    public void addTransport(Transport transport){
        if (transport.checkTransportNeedService())
            queue.add(transport);
    }

    public void technicalInspectionCar(){
        if (!queue.isEmpty()){
            Transport transport = queue.poll();
            transport.repair();
        }
    }

    public  void carryOutVehicleInspection(Queue<Transport> queue) {
        if (queue.isEmpty()){
            System.out.println("У транспорта нет механика");
        } else {
            while (!queue.isEmpty()) {
                Transport currentTransport = queue.poll();
                List<Mechanics> mechanicsList = currentTransport.getMechanicsList();
                for (Mechanics mechanics : mechanicsList) {
                    mechanics.carryOutMaintenance(currentTransport);
                }
            }

        }
    }
}
