package excercises.serverTracker;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Daniel Nacher
 * 2024-06-14
 *
 * Physical servers used by our project are labeled using printed labels, with exactly one label
 * being attached to a server at any given time. Each label consists of an alphabetic host type (e.g.
 * "apibox") concatenated with the server number, with server numbers allocated sequentially (so,
 * the first label will be "apibox:1", next one "apibox:2", etc). As servers are provisioned and
 * deprovisioned, the labels get attached and detached; detached labels can later be reused for
 * the same host type.
 * We would like to keep the total number of labels printed to a minimum (we’re environmentally
 * friendly!). We would also like to maintain sequential numbering to the extent possible, so when
 * we need a label, we always pick the one with the lowest number.
 *
 * Your task is to write a label tracking class with two operations, "attach(hostType)" and
 *
 * "detach(label)". The former should return the next label to use,
 * while the latter should return the
 * label back into the pool.
 *
 * For example:
 * const tracker = new Tracker();
 * tracker.attach("apibox");
 * >> "apibox:1"
 * tracker.attach("apibox");
 * >> "apibox:2"
 * tracker.detach("apibox:1");
 * tracker.attach("apibox");
 * >> "apibox:1"
 * tracker.attach("apibox");
 * >> "apibox:3"
 * tracker.detach("apibox:2");
 * tracker.attach("apibox");
 * >> "apibox:2"
 * tracker.attach("sitebox");
 * >> "sitebox:1"
 *
 *
 * serverAttached nombre,count;
 *
 * Server detached <String, List<Integer> nombre, List<Integer>
 *
 * Map<String, Integer> map
 * atach -> apibox -> map.get(apibox)
 *
 *
 *
 */



public class ServerTracker {

    public static Map<String, TreeSet<Integer>> detachedMap = new HashMap<>();
    public static Map<String, Integer> serverCount = new HashMap<>();

    public static String attach(String serverName) {
        TreeSet<Integer> detachedList = detachedMap.get(serverName);
        if(detachedList!=null && detachedList.size()>0) {
            Integer firstDetached = detachedList.first();
            detachedList.remove(firstDetached);
            detachedMap.put(serverName, detachedList);
            return serverName + ":" + firstDetached;
        } else {
            Integer count = serverCount.get(serverName);
            if(count!=null) {
                serverCount.put(serverName, count+1);
                return serverName + ":" + (count + 1);
            } else {
                serverCount.put(serverName, 1);
                return serverName + ":" + 1;
            }

        }
    }

    public static void detach(String serverName) {
        String[] splitServerName = serverName.split(":");
        String server = splitServerName[0];
        String label = splitServerName[1];
        TreeSet<Integer> detachedList = detachedMap.get(server);
        if(detachedList==null) {
            detachedList = new TreeSet<>();
        }
        detachedList.add(Integer.valueOf(label));
        detachedMap.put(server, detachedList);
    }
}
