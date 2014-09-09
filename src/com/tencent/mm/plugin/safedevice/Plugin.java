package com.tencent.mm.plugin.safedevice;

import com.tencent.mm.model.bd;
import com.tencent.mm.plugin.safedevice.a.f;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.e;

public class Plugin
  implements c
{
  public e createApplication()
  {
    return new a();
  }

  public bd createSubCore()
  {
    return new f();
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.Plugin
 * JD-Core Version:    0.6.2
 */