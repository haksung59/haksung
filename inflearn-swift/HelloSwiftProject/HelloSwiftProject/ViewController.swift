//
//  ViewController.swift
//  HelloSwiftProject
//
//  Created by haksung on 2022/07/24.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var lbl: UILabel!
    @IBAction func changeLabel(_ sender: Any) {
        lbl.text = "Hello, Swift"
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


}

