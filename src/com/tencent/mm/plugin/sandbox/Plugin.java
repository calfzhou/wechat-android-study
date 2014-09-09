package com.tencent.mm.plugin.sandbox;

import com.tencent.mm.model.bd;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.e;

public class Plugin
  implements c
{
  private a fUG = new a();

  public e createApplication()
  {
    return this.fUG;
  }

  public bd createSubCore()
  {
    return null;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sandbox.Plugin
 * JD-Core Version:    0.6.2
 */