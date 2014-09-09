package com.tencent.mm.pluginsdk.b;

import android.content.Intent;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.o;

public abstract interface a
{
  public abstract boolean ID();

  public abstract boolean a(o paramo, i parami, boolean paramBoolean, int paramInt);

  public abstract boolean ky(String paramString);

  public abstract void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.b.a
 * JD-Core Version:    0.6.2
 */