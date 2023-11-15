package com.bigcorp.project.main.correctionformateur;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;


public class CyclicBarrierExercice {

	public static void main(String[] args) throws InterruptedException {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(9, new BarriereOuverte());
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
		Thread.sleep(6_000);
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
		new Thread(new Runner(cyclicBarrier)).start();
	}

	private static final class Runner implements Runnable {

		private CyclicBarrier barrier;

		public Runner(CyclicBarrier barrier) {
			this.barrier = barrier;
		}

		@Override
		public void run() {
			try {
				Random r = new Random();
				System.out.println("Début du runnable !");
				this.barrier.await();
				System.out.println("J'ai passé la barrière !");
				TimeUnit.SECONDS.sleep(r.nextLong(0, 11));
				System.out.println("Fin du runnable !");
			} catch (InterruptedException | BrokenBarrierException e) {
				return;
			}
		}
	}

	private static final class BarriereOuverte implements Runnable {
		@Override
		public void run() {
			System.out.println("La barrière est ouverte");
		}
	}

}
