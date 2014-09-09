package com.tencent.mm.platformtools;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class ao
{
  public static boolean dVA = false;
  public static boolean dVB = false;
  public static boolean dVC = false;
  public static int dVD = 0;
  public static boolean dVE = false;
  public static boolean dVF = false;
  public static boolean dVG = false;
  public static String dVH = "";
  public static String dVI = "";
  public static boolean dVJ = false;
  public static boolean dVK = false;
  public static boolean dVL = false;
  public static boolean dVM = false;
  public static boolean dVN = false;
  public static boolean dVO = false;
  public static boolean dVP = false;
  public static int dVQ = 0;
  public static int dVR = 0;
  public static boolean dVS = false;
  public static String dVT = null;
  public static String dVU = null;
  public static boolean dVV = false;
  public static boolean dVW = false;
  public static int dVX = 0;
  public static int dVY = 0;
  public static int dVZ = 0;
  public static boolean dVn = false;
  public static boolean dVo = false;
  public static boolean dVp = false;
  public static boolean dVq = false;
  public static boolean dVr = false;
  public static boolean dVs = false;
  public static boolean dVt = false;
  public static boolean dVu = false;
  public static boolean dVv = false;
  public static boolean dVw = false;
  public static boolean dVx = false;
  public static String dVy = "";
  public static boolean dVz = false;
  public static String dWa = "";
  public static String dWb = null;
  public static String dWc = null;
  public static boolean dWd = false;
  public static boolean dWe = false;
  public static String dWf = "";
  public static String dWg = "";
  public static String dWh = "";
  public static String dWi = "";
  public static String dWj = "";
  public static boolean dWk = true;
  public static boolean dWl = false;
  public static boolean dWm = false;
  private static HashMap dWn = new HashMap();

  public static void O(int paramInt1, int paramInt2)
  {
    synchronized (dWn)
    {
      ConcurrentLinkedQueue localConcurrentLinkedQueue = (ConcurrentLinkedQueue)dWn.get(Integer.valueOf(paramInt1));
      if (localConcurrentLinkedQueue == null)
      {
        localConcurrentLinkedQueue = new ConcurrentLinkedQueue();
        dWn.put(Integer.valueOf(paramInt1), localConcurrentLinkedQueue);
      }
      localConcurrentLinkedQueue.add(Integer.valueOf(paramInt2));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ao
 * JD-Core Version:    0.6.2
 */