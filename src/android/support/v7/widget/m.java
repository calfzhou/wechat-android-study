package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

final class m
{
  private Method JX;
  private Method JY;
  private Method JZ;
  private Method Ka;

  m()
  {
    try
    {
      this.JX = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      this.JX.setAccessible(true);
      try
      {
        label27: this.JY = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.JY.setAccessible(true);
        try
        {
          label50: Class[] arrayOfClass2 = new Class[1];
          arrayOfClass2[0] = Boolean.TYPE;
          this.JZ = AutoCompleteTextView.class.getMethod("ensureImeVisible", arrayOfClass2);
          this.JZ.setAccessible(true);
          try
          {
            label84: Class[] arrayOfClass1 = new Class[2];
            arrayOfClass1[0] = Integer.TYPE;
            arrayOfClass1[1] = ResultReceiver.class;
            this.Ka = InputMethodManager.class.getMethod("showSoftInputUnchecked", arrayOfClass1);
            this.Ka.setAccessible(true);
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException4)
          {
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          break label84;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label50;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      break label27;
    }
  }

  final void a(InputMethodManager paramInputMethodManager, View paramView)
  {
    if (this.Ka != null)
      try
      {
        Method localMethod = this.Ka;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(0);
        arrayOfObject[1] = null;
        localMethod.invoke(paramInputMethodManager, arrayOfObject);
        return;
      }
      catch (Exception localException)
      {
      }
    paramInputMethodManager.showSoftInput(paramView, 0);
  }

  final void a(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.JX != null);
    try
    {
      this.JX.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  final void b(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.JY != null);
    try
    {
      this.JY.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  final void c(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.JZ != null);
    try
    {
      Method localMethod = this.JZ;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(true);
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.m
 * JD-Core Version:    0.6.2
 */