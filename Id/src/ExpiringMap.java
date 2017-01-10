import java.util.HashMap;

/**
 * Created by robertcheng on 1/10/17.
 */

//面试的环境是hackerrank，面试官的意思是要求写一个类似于hashmap的结构，其中除了传统的key和value之外另加了一个duration。 要求实现的功能是说讲一个数据存入此Map后，在duration的时间范围内call get function可以得出相应的value。 但是一但超出duration的这个时间，再call get function就只能返回 null。 举个例子 ：
//        put(10, 35, 3000)；
//        //在3000 毫秒以内：
//        get(10) --> return 35;
//        //超出3000毫秒：
//        get(10) --> return null;
// 和面经一样，也问了cleanup thread，随便写了写，然后各中多线程的问题

// Solution 1
public class Data {
    V value;
    long duration;
    long startTime;

    public Data(V value, long duration, long startTime){
        this.value = value;
        this.duration = duration;
        this.startTime = startTime;
    }
}

public class ExpiringMap {
    HashMap map = new HashMap<K, Data>;

    //put
    public void put(K key, V value, long durationMillis){
        long startTime = System.currentTimeMillis();
        Data data = new Data(value, durationMillis, startTime);
        map.put(key, data);
    }

    //get
    public V get(K key){
        Data data = map.get(key);
        if (data == null){
            return null;
        }
        if (data.startTime + data.duration <=  System.currentTimeMillis()) {
            return data.value;
        } else {
            map.remove(key);
        }

        return null;
    }
}

// Solution 2 two hashmaps

import java.util.HashMap;
import java.util.Map;

public class ExpiredMap<K,V> {
    Map<K,V> map;
    Map<K,LifeCycle> lifeMap ;
    public ExpiredMap() {. more info on 1point3acres.com
        this.map =  new HashMap<K,V>(); ;
        this.lifeMap = new HashMap<K,LifeCycle>();

    }

    public void put(K key, V value, long duration) {
        LifeCycle lifeCycle = new LifeCycle(duration);
        map.put(key, value);
        lifeMap.put(key, lifeCycle);
    }

    public V get(K key) {
        LifeCycle lifeCycle = lifeMap.get(key) ;
        if(lifeCycle == null  || lifeCycle.isExpired()){
            return null;
        }
        return map.get(key);
    }
    class LifeCycle{
        long start;
        long duration;
        public LifeCycle(long duration){
            start = System.currentTimeMillis();
            this.duration = duration;
        }
        public boolean isExpired(){
            return System.currentTimeMillis() - start > duration;
        }
    }
}
