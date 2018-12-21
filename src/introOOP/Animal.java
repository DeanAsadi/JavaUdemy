package introOOP;

public class Animal {

	public static void main(String[] args) {
		
		//-------------------------------
		Zoo bat = new Zoo( "Bat", "blood", " at night." ) ;
		Zoo tiger = new Zoo("Tiger"," meat", " in the morning.");
		
		bat.specs();
		tiger.specs();
		
		//-------------------------------
//		Bird bird1 = new Bird( "Small bird " , "worms " , " night" );
		
		
		
		//-------------------------------
		Fish fish1 = new Fish( "Small fish ", " fish food ", "'nope' never sleeps" );
		
		fish1.fishy();
		fish1.specs(); // Fish can also access methods in Zoo class, because it extends from it
		
		//-------------------------------
		Flyable flyingSparrow = new Sparrow( "Tiny Sparrow bird", "worms", "night" );
		flyingSparrow.fly();
		

	}

}







// in run time : There are two memory locations the become reserved when you hit the "run" button,
// one memory area called "STACK" the other one called "HEEP"

// STACK : It maintain method's invocations,
// When you hit "run", main() gets fired first, and the following one's, 
// so, when all the following methods get into stack to get executed one by one, it will be removed one by one.
// hint, one method finished executions, it will be removed and start executing the following one's.
// the only method will remain is main() method, when the application done running completely, main() will be removed off the stack.

//Heap : Where that object resides in memory, "Car myCar;" this is a variable stored in main currently,
// But when we do "myCar = new Car();" What get assigned to myCar is the "memory address"  on the HEAP.
// if you again assign, myCar = new Car(); Now you're referencing to a new "memory address" on the HEAP, for car();

// CARBAGE COLLECTION : This is where CARBAGE COLLECTION comes in, it's a process that run's in the HEAP 
// and looks for object's that don't have any relationship to them, and it removes them.