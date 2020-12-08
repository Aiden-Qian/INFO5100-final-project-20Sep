
/**
 *
 * @author qc
 */
public class LoginDealerController {
    public LoginDealerView getPanel() { return panel; }
    private LoginDealerView panel;

    public LoginDealerController() {
        panel.Login.addActionListener(e->{
            if(!SqlConnection.getDealerId().equalsIgnoreCase(panel.Id.getText())){
                panel.Warnning.setText("*Incorrect Id or Password");
                panel.Warnning.setForeground(Color.RED);
                panel.Wrong_id.setText("*");
                panel.Wrong_id.setForeground(Color.RED);
            }
            else if(!SqlConnection.getDealerPassword().equalsIgnoreCase(panel.Password.getText())){
                panel.Warnning.setText("*Incorrect Id or Password");
                panel.Warnning.setForeground(Color.RED);
                panel.Wrong_password.setText("*");
                panel.Wrong_password.setForeground(Color.RED);
            }
            else if(!SqlConnection.getDealerId().equalsIgnoreCase(panel.Id.getText())||!SqlConnection.getDealerId().equalsIgnoreCase(panel.Password.getText())){
                panel.Warnning.setText("*Incorrect Id or Password");
                panel.Warnning.setForeground(Color.RED);
                panel.Wrong_password.setText("*");
                panel.Wrong_password.setForeground(Color.RED);
                panel.Wrong_id.setText("*");
                panel.Wrong_id.setForeground(Color.RED);
            }
            else{
                panel.setVisible(false);
            }
        });


    }
}
