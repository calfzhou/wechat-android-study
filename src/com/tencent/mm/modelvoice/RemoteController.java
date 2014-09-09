package com.tencent.mm.modelvoice;

import android.content.ComponentName;
import android.media.AudioManager;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RemoteController
{
  private static Method dHk;
  private static Method dHl;
  private AudioManager dHi;
  private ComponentName dHj;

  static
  {
    try
    {
      if (dHk == null)
        dHk = AudioManager.class.getMethod("registerMediaButtonEventReceiver", new Class[] { ComponentName.class });
      if (dHl == null)
        dHl = AudioManager.class.getMethod("unregisterMediaButtonEventReceiver", new Class[] { ComponentName.class });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }

  protected final void finalize()
  {
    try
    {
      Method localMethod1 = dHl;
      if (localMethod1 == null);
      while (true)
      {
        super.finalize();
        return;
        Method localMethod2 = dHl;
        AudioManager localAudioManager = this.dHi;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.dHj;
        localMethod2.invoke(localAudioManager, arrayOfObject);
        RemoteController.RemoteControlReceiver.Bp();
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Throwable localThrowable = localInvocationTargetException.getCause();
      if ((localThrowable instanceof RuntimeException))
        throw ((RuntimeException)localThrowable);
      if ((localThrowable instanceof Error))
        throw ((Error)localThrowable);
      throw new RuntimeException(localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpLxZ3s2f/sNV4nKd9KlcPzYAJUV4T6XQso=", "unexpected " + localIllegalAccessException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.RemoteController
 * JD-Core Version:    0.6.2
 */