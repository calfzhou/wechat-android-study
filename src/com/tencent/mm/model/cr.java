package com.tencent.mm.model;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.z;

public final class cr
{
  private int dme;
  private int dmf;
  private int dmg;
  private int id;

  public final cr cT(int paramInt)
  {
    this.dme = paramInt;
    return this;
  }

  public final cr cU(int paramInt)
  {
    this.dmf = paramInt;
    return this;
  }

  public final cr cV(int paramInt)
  {
    this.dmg = paramInt;
    return this;
  }

  public final boolean commit()
  {
    SharedPreferences.Editor localEditor = cq.a(cq.rO()).edit();
    if (this.id > 0)
    {
      localEditor.putInt("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=style_id", this.id);
      if (this.dme <= 0)
        break label171;
      localEditor.putInt("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=new_flow", this.dme);
      label52: if (this.dmf <= 0)
        break label183;
      localEditor.putInt("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=has_password", this.dmf);
      label72: if (this.dmg <= 0)
        break label195;
      localEditor.putInt("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=has_AVATAR", this.dmg);
    }
    while (true)
    {
      z.i("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=", "id: " + this.id + " newFlow: " + this.dme + "hasPassword:" + this.dmf + "hasAvatar:" + this.dmg);
      return localEditor.commit();
      localEditor.remove("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=style_id");
      break;
      label171: localEditor.remove("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=new_flow");
      break label52;
      label183: localEditor.remove("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=has_password");
      break label72;
      label195: localEditor.remove("!44@/B4Tb64lLpIq8/rz82HB73s3T0aShOZicGQMdPpMx80=has_AVATAR");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cr
 * JD-Core Version:    0.6.2
 */