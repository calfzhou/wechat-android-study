package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;

public abstract interface p
{
  public abstract boolean checkArgs();

  public abstract void serialize(Bundle paramBundle);

  public abstract int type();

  public abstract void unserialize(Bundle paramBundle);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.p
 * JD-Core Version:    0.6.2
 */