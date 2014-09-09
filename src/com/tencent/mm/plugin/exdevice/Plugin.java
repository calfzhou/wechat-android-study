package com.tencent.mm.plugin.exdevice;

import com.tencent.mm.model.bd;
import com.tencent.mm.plugin.exdevice.b.z;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.e;

public class Plugin
  implements c
{
  public e createApplication()
  {
    return new d();
  }

  public bd createSubCore()
  {
    return new z();
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.Plugin
 * JD-Core Version:    0.6.2
 */