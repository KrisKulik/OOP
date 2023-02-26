package transport;

import java.util.LinkedList;
import java.util.Queue;


public class ServiceStation {
   private Queue<Transport<?>> queue = new LinkedList<>();

   public ServiceStation(Queue<Transport<?>> queue) {
      this.queue = queue;
   }
   public ServiceStation() {
      queue = new LinkedList<>();
   }
   public void addAuto(Transport <?> auto) {
      if (auto != null) {
         System.out.println("Добавить в очередь на СТО ");
      } queue.add(auto);
   }
   public void carryOutTechnicalInspection (Transport<?> auto) throws TransportTypeException {
      if(auto.passDiagnostic() || queue.isEmpty()) {
         System.out.println("Пройти технический осмотр");
      } queue.poll();
   }

}


