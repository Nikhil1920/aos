public class Philosopher extends Thread {
	private Chopstick _leftChopistick;
	private Chopstick _rightChopistick;

	private String _name;
	private int _rounds;

	public Philosopher(String name, Chopstick _left, Chopstick _right, int rounds) {

		this._name = name;
		_leftChopistick = _left;
		_rightChopistick = _right;
		_rounds = rounds;
	}

	public void eat() {
		if (!_leftChopistick.used) {
			if (!_rightChopistick.used) {
				_leftChopistick.take();
				_rightChopistick.take();

				Log.msg(_name + " : Eat");

				Log.Delay(1000);

				_rightChopistick.release();
				_leftChopistick.release();
			}
		}
		think();
	}

	public void think() {

		Log.msg(_name + " : Think");
		Log.Delay(1000);

	}

	public void run() {
		for (int i = 0; i <= _rounds; i++) {
			eat();
		}
	}
}
