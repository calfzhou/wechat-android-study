package com.tencent.mm.compatible.g;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.mm.sdk.platformtools.z;

@TargetApi(8)
public final class e
  implements d
{
  private Context context;
  private AudioManager dOD;
  private c dOE;
  private AudioManager.OnAudioFocusChangeListener dOF = new f(this);

  public e(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(c paramc)
  {
    this.dOE = paramc;
  }

  public final boolean nH()
  {
    if ((this.dOD == null) && (this.context != null))
      this.dOD = ((AudioManager)this.context.getSystemService("audio"));
    boolean bool;
    if (this.dOD != null)
      if (1 == this.dOD.abandonAudioFocus(this.dOF))
        bool = true;
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!44@/B4Tb64lLpLCq+BipdDzGSEj50wMwdFVuq5cXvM0LPk=", "jacks abandonFocus: %B", arrayOfObject);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  public final boolean requestFocus()
  {
    if ((this.dOD == null) && (this.context != null))
      this.dOD = ((AudioManager)this.context.getSystemService("audio"));
    boolean bool;
    if (this.dOD != null)
      if (1 == this.dOD.requestAudioFocus(this.dOF, 3, 2))
        bool = true;
    while (true)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.d("!44@/B4Tb64lLpLCq+BipdDzGSEj50wMwdFVuq5cXvM0LPk=", "jacks requestFocus: %B", arrayOfObject);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.e
 * JD-Core Version:    0.6.2
 */