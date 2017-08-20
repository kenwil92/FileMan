package exapp.kk;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Bean1
 */
@Stateless
@LocalBean
public class Bean1 {
 public String beanMethod(){
  return "BeanMethod executed...";
   }
 }


