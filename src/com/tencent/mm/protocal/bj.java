package com.tencent.mm.protocal;

import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.a.abj;
import com.tencent.mm.protocal.a.qe;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class bj
{
  private static Map aV(byte[] paramArrayOfByte)
  {
    if (ch.B(paramArrayOfByte))
      return null;
    abj localabj;
    try
    {
      localabj = new abj().cv(paramArrayOfByte);
      if (localabj == null)
        return null;
    }
    catch (Exception localException)
    {
      return null;
    }
    z.d("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "dkpush : keyCount:" + localabj.isr);
    LinkedList localLinkedList = localabj.iss;
    if (localLinkedList.size() != localabj.isr)
      return null;
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < localabj.isr; i++)
      localHashMap.put(Integer.valueOf(((qe)localLinkedList.get(i)).hPS), Long.valueOf(0xFFFFFFFF & ((qe)localLinkedList.get(i)).ifK));
    if (localHashMap.size() != localabj.isr)
      return null;
    return localHashMap;
  }

  public static byte[] f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length <= 0))
    {
      z.d("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "empty old key, use new key");
      return paramArrayOfByte2;
    }
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
    {
      z.e("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "newKey is null");
      return null;
    }
    PByteArray localPByteArray = new PByteArray();
    try
    {
      if (!MMProtocalJni.mergeSyncKey(paramArrayOfByte1, paramArrayOfByte2, localPByteArray))
      {
        z.e("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "merge key failed");
        return null;
      }
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "NoSuchMethod MMProtocalJni.mergeSyncKey", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(localIncompatibleClassChangeError));
    }
    return localPByteArray.value;
  }

  public static boolean g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Map localMap1 = aV(paramArrayOfByte1);
    if (localMap1 == null)
    {
      z.d("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "dkpush local sync key failed");
      return true;
    }
    Map localMap2 = aV(paramArrayOfByte2);
    if (localMap2 == null)
    {
      z.e("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "dkpush svr sync key failed");
      return false;
    }
    Iterator localIterator = localMap2.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      Long localLong1 = (Long)localMap1.get(localInteger);
      Long localLong2 = (Long)localMap2.get(localInteger);
      if (localLong1 == null)
      {
        z.d("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "dkpush local key null :" + localInteger);
        return true;
      }
      z.d("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "dkpush local key:" + localInteger + " sv:" + localLong2 + " lv:" + localLong1);
      if (localLong2.longValue() > localLong1.longValue())
        return true;
    }
    z.d("!32@/B4Tb64lLpJCHKz7PEeOCmqPpZbQCAms", "dkpush two sync key is the same");
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.bj
 * JD-Core Version:    0.6.2
 */