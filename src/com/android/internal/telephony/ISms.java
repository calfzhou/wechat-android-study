package com.android.internal.telephony;

import android.app.PendingIntent;
import android.os.IInterface;
import java.util.List;

public abstract interface ISms extends IInterface
{
  public abstract boolean copyMessageToIccEf(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  public abstract boolean disableCellBroadcast(int paramInt);

  public abstract boolean enableCellBroadcast(int paramInt);

  public abstract List getAllMessagesFromIccEf();

  public abstract void sendData(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2);

  public abstract void sendMultipartText(String paramString1, String paramString2, List paramList1, List paramList2, List paramList3);

  public abstract void sendText(String paramString1, String paramString2, String paramString3, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2);

  public abstract boolean updateMessageOnIccEf(int paramInt1, int paramInt2, byte[] paramArrayOfByte);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.android.internal.telephony.ISms
 * JD-Core Version:    0.6.2
 */