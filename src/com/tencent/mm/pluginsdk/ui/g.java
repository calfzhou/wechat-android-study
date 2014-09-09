package com.tencent.mm.pluginsdk.ui;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

public final class g
{
  private int hxq = -7829368;
  private boolean hxr = false;
  private int hxs = -1593835521;
  private boolean hxt = false;
  private int hxu = -16777216;
  private boolean hxv = false;
  private int hxw = 0;
  private boolean hxx = false;
  private int version = 0;

  public g(String paramString)
  {
    Map localMap = x.bB(paramString, "chatbg");
    String str = "." + "chatbg";
    try
    {
      this.version = ch.a(Integer.valueOf((String)localMap.get(str + ".$version")));
      this.hxq = ((int)ch.a(Long.valueOf(Long.parseLong((String)localMap.get(str + ".$time_color"), 16)), -7829368L));
      this.hxr = ch.b(Boolean.valueOf((String)localMap.get(str + ".$time_show_shadow_color")));
      this.hxs = ((int)ch.a(Long.valueOf(Long.parseLong((String)localMap.get(str + ".$time_shadow_color"), 16)), 0L));
      this.hxt = ch.b(Boolean.valueOf((String)localMap.get(str + ".$time_show_background")));
      this.hxu = ((int)ch.a(Long.valueOf(Long.parseLong((String)localMap.get(str + ".$voice_second_color"), 16)), -16777216L));
      this.hxv = ch.b(Boolean.valueOf((String)localMap.get(str + ".$voice_second_show_shadow_color")));
      this.hxw = ((int)ch.a(Long.valueOf(Long.parseLong((String)localMap.get(str + ".$voice_second_shadow_color"), 16)), 0L));
      this.hxx = ch.b(Boolean.valueOf((String)localMap.get(str + ".$voice_second_show_background")));
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpIvaLo4mBOuAvlEfDqYIBEB", "parse chatbgattr failed");
    }
  }

  public final int azE()
  {
    return this.hxq;
  }

  public final int azF()
  {
    return this.hxs;
  }

  public final boolean azG()
  {
    return this.hxt;
  }

  public final int azH()
  {
    return this.hxu;
  }

  public final int azI()
  {
    return this.hxw;
  }

  public final boolean azJ()
  {
    return this.hxx;
  }

  public final boolean azK()
  {
    return this.hxr;
  }

  public final boolean azL()
  {
    return this.hxv;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.g
 * JD-Core Version:    0.6.2
 */