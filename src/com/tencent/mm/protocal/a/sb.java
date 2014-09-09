package com.tencent.mm.protocal.a;

import b.a.a.a.a;
import java.util.LinkedList;

public final class sb extends vo
{
  public int ewb;
  public int hOO;
  public vt hOQ;
  public int hOV;
  public long hOY;
  public int hQw;
  public int ilT;
  public int ilU;

  public static boolean a(a parama, sb paramsb, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
      paramsb.hQw = parama.bel();
      return true;
    case 2:
      LinkedList localLinkedList = parama.rN(paramInt);
      int i = localLinkedList.size();
      for (int j = 0; j < i; j++)
      {
        byte[] arrayOfByte = (byte[])localLinkedList.get(j);
        vt localvt = new vt();
        a locala = new a(arrayOfByte, hre);
        for (boolean bool = true; bool; bool = vt.a(locala, localvt, locala.bet()));
        paramsb.hOQ = localvt;
      }
      return true;
    case 3:
      paramsb.hOO = parama.bel();
      return true;
    case 4:
      paramsb.ilT = parama.bel();
      return true;
    case 5:
      paramsb.hOV = parama.bel();
      return true;
    case 6:
      paramsb.ilU = parama.bel();
      return true;
    case 7:
      paramsb.ewb = parama.bel();
      return true;
    case 8:
    }
    paramsb.hOY = parama.ber();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.sb
 * JD-Core Version:    0.6.2
 */