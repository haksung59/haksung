//
//  ViewController.swift
//  MyAlbum
//
//  Created by haksung on 2022/07/15.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    @IBAction func showAlert(_ sender: Any) {
        let alert = UIAlertController(title:"Hello", message: "My First App!!", preferredStyle: .alert)
        let action = UIAlertAction(title:"OK", style:.default, handler: nil)
        alert.addAction(action)
        present(alert, animated: true, completion: nil)
    }
}

