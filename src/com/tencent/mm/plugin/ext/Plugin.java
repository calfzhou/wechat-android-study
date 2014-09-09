package com.tencent.mm.plugin.ext;

import com.tencent.mm.model.bd;
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
    return new b();
  }

  public com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.Plugin
 * JD-Core Version:    0.6.2
 */