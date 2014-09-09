package com.tencent.mm.plugin.ext.provider;

import android.database.Cursor;
import com.tencent.mm.pluginsdk.d.a.a;

final class m
  implements Runnable
{
  m(ExtControlProviderSearchContact paramExtControlProviderSearchContact, Cursor paramCursor, a parama)
  {
  }

  public final void run()
  {
    ExtControlProviderSearchContact localExtControlProviderSearchContact = this.eMO;
    ExtControlProviderSearchContact.a(localExtControlProviderSearchContact, ExtControlProviderSearchContact.c(this.eMN));
    this.eMc.countDown();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.m
 * JD-Core Version:    0.6.2
 */