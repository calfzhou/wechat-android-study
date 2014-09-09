package com.tencent.mm.plugin.accountsync;

import com.tencent.mm.model.bd;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.plugin.accountsync.a.f;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.e;

public final class Plugin
  implements c
{
  public final e createApplication()
  {
    return new a();
  }

  public final bd createSubCore()
  {
    return new f();
  }

  public final b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.Plugin
 * JD-Core Version:    0.6.2
 */