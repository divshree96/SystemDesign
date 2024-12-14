Walmart Question : 

Suppose there is a amazon website where u search a product say
iphone which is out of stock and there is a button notify me.
Implement Notify me.

Observer Design Pattern:

2 things :
1. Observable - State changes (As soon as the state changes notify all observers)
2. Observer - (waits for update from observable)

## ObservableInterface

List<ObserverInterface> objList;

add(ObserverInterface obj) - Registration
remove(ObserverInterface obj)
notify() - send notification to all in the "objList"
setData() 
getData() 

## ObserverInterface

update()


ObservableInterface ---(0, *) --HAS A----> ObserverInterface (Relationship)

## ObservableConcreteClass ---IS A---> ObservableInterface
int data;
add(ObserverInterface obj) {
    objList.add(obj);
}

remove(ObserverInterface obj) {
    objList.remove(obj);
}

notify() {
    for(ObserverInterface obj : objList) {
        obj.update(ObservableInterface obj);
    }
}

setData(int t) {
    data = t;
    notify();
}

getData() {
    return data;
}

## ObserverConcreateClass --IS A---> ObserverInterface
ObserverConcreateClass --HAS A---> ObservableConcreteClass

ObservableInterface obj;

update() {
    obj.getData();
}


Example with above understanding :- Weather station (sets temperature every hour)
It is being observed by : TV Display Observer, Mobile Display Observer


interface WSObservable {
    List<DisplayObserver> list;

    add(DisplayObserver obj);
    remove(DisplayObserver obj);
    notify();
    setTemperature();
    getData();
}

class WSObservableImpl implements WSObservable {
    List<DisplayObserver> list;
    int temp;
    add(DisplayObserver obj) {}
    remove(DisplayObserver obj) {}
    notify() {
        for(DisplayObserver ob : list) {
            ob.update();
        }
    }

    setData(int newTemp) {
        currTemp = newTemp;
        notify();
    }

    getData() {
        return temp;
    }
}


interface DisplayObserver {
    update();
}

class MobileDisplayObserver implement DisplayObserver {
    WSObservable obj;

    MobileDisplayObserver(WSObservable o) {
        this.obj = o;
    }

    update() {
        obj.getData();
    }
}

class TVDisplayObserver implement DisplayObserver {
    WSObservable obj;

    TVDisplayObserver(WSObservable o) {
        this.obj = o;
    }

    update() {
        obj.getData();
    }
}


















