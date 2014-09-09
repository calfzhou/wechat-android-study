package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.plugin.c.a.d.a;
import com.tencent.mm.sdk.platformtools.z;

public class ap extends aa
{
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = a.aj(paramLong);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = Integer.valueOf(paramInt3);
    z.i("!56@/B4Tb64lLpLHXwcx366fGtx5+4K60VCY2Op7lBJ9W1/FlItBgfZAYA==", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ap
 * JD-Core Version:    0.6.2
 */